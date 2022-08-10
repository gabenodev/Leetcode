class Solution(object):
    def interpret(self, command):
        return command.replace('()' , 'o').replace('(al)','al')
        """
        :type command: str
        :rtype: str
        """
        