Run("notepad.exe")
WinWaitActive("Untitled - Notepad")
Send("this is simple text")

WinClose("Untitled - Notepad")