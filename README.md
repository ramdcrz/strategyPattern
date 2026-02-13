# strategyPattern
<b>Lab Assignment 1: Game Character Strategy</b>

<p>
A game application needs to manage different types of characters, including Knights, Wizards, and Archers. Each character type has unique ways of attacking and defending.
<ul>
<li><b>Knight:</b> Attacks with a sword and can use multiple defense strategies (Shield, Dodge, and Magic Barrier).</li>
<li><b>Wizard:</b> Casts spells for attacks and uses a magic barrier for defense.</li>
<li><b>Archer:</b> Shoots arrows for attacks and uses dodging to avoid damage.</li>
</ul>
</p>

<p>
Currently, the system relies on conditional statements within a single Character class to determine behaviors based on the character type. This approach is rigid, hard to maintain, and violates the Open/Closed Principle.

Implement the Strategy pattern to improve code maintainability and flexibility:

<ol>
<li><b>Define Attack Strategies:</b> Create an interface <code>AttackStrategy</code> and concrete classes: <code>SwingSword</code>, <code>CastSpell</code>, and <code>ShootArrow</code>.</li>
<li><b>Define Defense Strategies:</b> Create an interface <code>DefenseStrategy</code> and concrete classes: <code>Shield</code>, <code>Dodge</code>, and <code>CreateMagic</code>.</li>
<li><b>Implement Strategy Behaviors:</b> Each concrete class provides the specific implementation for the action (e.g., <code>SwingSword</code> prints the sword attack logic).</li>
<li><b>Refactor Character Class:</b></li>
<ul>
<li>Introduce references for <code>AttackStrategy</code> and <code>DefenseStrategy</code>.</li>
<li>Remove all <code>if-else</code> strings and hardcoded type checks.</li>
<li>Allow strategies to be swapped dynamically via setter methods.</li>
<li>Delegate the <code>attack()</code> and <code>defend()</code> actions to the current strategy objects.</li>
</ul>
</ol>
</p>

<p><b>Logic:</b>
<ul>
<li><b>Knight:</b>
<ul>
<li>Uses <b>SwingSword</b> for attacks.</li>
<li>Can switch between <b>Shield</b>, <b>Dodge</b>, and <b>CreateMagic</b> for defense.</li>
</ul>
</li>
<li><b>Wizard:</b>
<ul>
<li>Uses <b>CastSpell</b> for attacks.</li>
<li>Uses <b>CreateMagic</b> for defense.</li>
</ul>
</li>
<li><b>Archer:</b>
<ul>
<li>Uses <b>ShootArrow</b> for attacks.</li>
<li>Uses <b>Dodge</b> for defense.</li>
</ul>
</li>
</ul>
</p>

<p><b>Composition of Character:</b>
<ul>
<li><b>type:</b> String (Optional Name)</li>
<li><b>attackStrategy:</b> AttackStrategy</li>
<li><b>defenseStrategy:</b> DefenseStrategy</li>
</ul>
</p>

<p><b>Methods:</b>
<ul>
<li><b>attack():</b> void // calls attackStrategy.attack()</li>
<li><b>defend():</b> void // calls defenseStrategy.defend()</li>
<li><b>setAttackStrategy(AttackStrategy):</b> void</li>
<li><b>setDefenseStrategy(DefenseStrategy):</b> void</li>
</ul>
</p>

<p><b>Note:</b> No if-else or switch statements will be used for behavior execution.</p>
<p>See <b>GameApp.java</b> class to test the characters and their strategies.</p>

## UML Diagram
![alt text](https://github.com/ramdcrz/strategyPattern/blob/main/strategyPattern_UML.png)
