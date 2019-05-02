public LogMessage(String message){
	int i = message.indexOf(":");
	machineId = message.substring(0, i);
	description = message.substring(i+1);
}
