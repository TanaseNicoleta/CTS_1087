package ro.ase.csie.cts.dp.command;

public class TaskToDo extends TaskAsincron {
    InterfataModulJoc modulJoc = null;
    String info;

    public TaskToDo(InterfataModulJoc modulJoc, String info) {
        this.modulJoc = modulJoc;
        this.info = info;
    }

    @Override
    public void executaTask() {
        if (this.modulJoc != null) {
            this.modulJoc.ececutaActiunea(info);
        } else
            throw new UnsupportedOperationException();
    }
}
