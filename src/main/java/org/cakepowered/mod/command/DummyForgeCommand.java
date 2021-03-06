package org.cakepowered.mod.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import org.cakepowered.api.command.CommandExecutor;
import org.cakepowered.mod.util.ForgeInterface;

import java.util.List;

public class DummyForgeCommand extends CommandBase {

    public CommandExecutor command;

    public DummyForgeCommand(CommandExecutor command) {
        this.command = command;
    }

    @Override
    public String getCommandName() {
        return command.getName();
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {

        return command.getCommandUsage(ForgeInterface.getCommandSender(sender));
    }

    @SuppressWarnings("rawtypes")
    @Override
    public List<String> getCommandAliases() {
        return command.getAlias();
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        try {
            command.execute(ForgeInterface.getCommandSender(sender), args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return command.canBeUsedBy(ForgeInterface.getCommandSender(sender));
    }

    @SuppressWarnings("rawtypes")
    @Override
    public List<String> getTabCompletionOptions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos pos) {
        return command.addTabCompletionOptions(ForgeInterface.getCommandSender(sender), args, ForgeInterface.getVector3(pos));
    }
}
