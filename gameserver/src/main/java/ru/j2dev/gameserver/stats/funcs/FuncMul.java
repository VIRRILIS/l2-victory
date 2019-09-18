package ru.j2dev.gameserver.stats.funcs;

import ru.j2dev.gameserver.stats.Env;
import ru.j2dev.gameserver.stats.Stats;

public class FuncMul extends Func {
    public FuncMul(final Stats stat, final int order, final Object owner, final double value) {
        super(stat, order, owner, value);
    }

    @Override
    public void calc(final Env env) {
        env.value *= getValue();
    }
}