package cc.davyy.ddapi;

import lombok.Setter;
import org.jetbrains.annotations.NotNull;

public abstract class DdAPI {

    @Setter
    private static DdAPI instance;

    public static @NotNull DdAPI getInstance() {
        if (instance == null) throw new IllegalStateException();

        return instance;
    }

}
