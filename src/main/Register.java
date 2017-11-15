package main;

public enum Register implements Operand {
    R0, R1, R2, R3, R4, R5, R6, R7, R8,
    R9, R10, R11, R12, R13, R14, R15;
    public String getCode(){
        return Integer.toHexString(ordinal());
    }
    
    public static int isRegister(String value) {
    	Register[] temp = Register.class.getEnumConstants();
    	int size = temp.length;
    	for(int i = 0; i < size; ++i) {
    		Register r = temp[i];
			if(r.name().equals(value))
				return i;
		}
		return -1;
    }
    
	public static Register getRegister(int id) {
		switch(id) {
			case 0:	return Register.R0;
			case 1: return Register.R1;
			case 2:	return Register.R2;
			case 3: return Register.R3;
			case 4:	return Register.R4;
			case 5: return Register.R5;
			case 6:	return Register.R6;
			case 7: return Register.R7;
			case 8:	return Register.R8;
			case 9: return Register.R9;
			case 10: return Register.R10;
			case 11: return Register.R11;
			case 12: return Register.R12;
			case 13: return Register.R13;
			case 14: return Register.R14;
			case 15: return Register.R15;
			default: return Register.R0;
		}
	}
}
