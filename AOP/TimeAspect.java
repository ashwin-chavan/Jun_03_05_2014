public aspect TimeAspect{
	private pointcut logtime(): call(* Employee.work(..));

	before() : logtime(){
		System.out.println("****BEFORE calling " + thisJoinPoint + " at " + new java.util.Date());
	}
	void around() : logtime(){
		System.out.println("***Facebook Blocked");
	}
	after() : logtime(){
		System.out.println("****AFTER calling " + thisJoinPoint + " at " + new java.util.Date());	
	}
}