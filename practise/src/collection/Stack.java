package collection;

import character.Hero;

public interface Stack {
    public void push(Hero h);
    public Hero pull();
    public Hero peek();
}
