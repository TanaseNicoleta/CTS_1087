package ro.ase.csie.cts.dp.command;

public class TestCommand {

    public static void main(String[] args) {
        TaskAsincron autoSave = new TaskToDo(new ModulAutoSave(), "Autosave");
        TaskAsincron autoUpdate = new TaskToDo(new ModulAutoSave(), "Update v2");
        
    }
}
