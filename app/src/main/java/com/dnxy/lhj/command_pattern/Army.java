package com.dnxy.lhj.command_pattern;
/**
 * 军队
 * 具体执行攻打任务
 * @author Administrator
 *
 */
public class Army {
	private Soldier soldier;
	
	public Army(Soldier soldier) {
		super();
		this.soldier = soldier;
	}
	
	public void attack()
	{
		soldier.setAttach("攻击  齐国");
		System.out.println("攻击  齐国");
		
	}
	
	public void back()
	{
		soldier.setBack("前方大事不妙，赶紧撤退");
		System.out.println("前方大事不妙，赶紧撤退");
	}
	public void undo()
	{
		soldier.setBack("原路撤退");
		System.out.println("原路撤退");
	}
	
}
