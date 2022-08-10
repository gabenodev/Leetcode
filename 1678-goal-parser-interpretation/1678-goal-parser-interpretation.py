class Solution(object):
    def interpret(self, command):
        
    #    return command.replace('()' , 'o').replace('(al)','al')
    
        string = ''
        i = 0
    
        while( i < len(command)):
        
            if(command[i] == 'G'):
                string += 'G'
                i += 1
            
            elif(command[i] == '(' and command[i+1] == 'a'):
                string += 'al'
                i += 4
            
            else:
                string += 'o'
                i += 2
            
            
    
        return string
        
    
    
        """
        :type command: str
        :rtype: str
        """
        