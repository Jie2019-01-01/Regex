正则表达式：
	定义了字符串模式
	可以用来搜索、编辑或处理文本
	并不限于某一种语言，但在某一种语言中都有细微的差别
正则表达式实例：
	字符串就是一个简单的正则表达式，如“Hello”匹配的就是“Hello”字符串
	\s+ 可以匹配多个空格
	\d+ 匹配一个或多个数字
	\. 匹配 .
三个类：
	Pattern 类：正则表达式的编译表示，创建Pattern对象调用其公共编译静态方法，该方法接受正则表达式作为它的第一个参数
	Matcher 类：Matcher 对象是对输入字符串进行解释和匹配操作的引擎。Pattern 对象的 matcher 方法来获得一个 Matcher 对象。
	PatternSyntaxException： 是一个非强制异常类，它表示一个正则表达式模式中的语法错误。
捕获组：
	把多个字符串当一个单独单元处理的方法，它通过对括号内的字符分组来创建
	捕获组是通过从左到右计算其括号来编号,例（（A）（B（C）））有四个这样的组：
		((A)(B(C)))
		(A)
		(B(C))
		(C)
	可以通过调用 matcher 对象的 groupCount 方法来查看表达式有多少个分组。
符号说明：
	* 零次或多次匹配
	+ 一次或多次匹配
	？ 零次或一次匹配
	{n} 正好匹配 n 次
	{n,} 至少匹配 n 次
	{n,m} 匹配至少 n 次，至多 m 次
	. 任何单个字符
	x|y 匹配 x 或 y
	[xyz] 匹配包含的任一字符
	[^xyz] 匹配未包含的任何字符
	[a-z] 字符范围。匹配指定范围内的任何字符
	[^a-z] 匹配不在指定的范围内的任何字符
	\b 匹配一个字边界,如:"er\b"匹配"never"中的"er"，但不匹配"verb"中的"er"。
	\B 与\b匹配相反
	\d 数字字符匹配
	\D 非数字字符匹配
	\w 匹配单词字符，与"[A-Za-z0-9_]"等效
	\W 非单词字符匹配。与"[^A-Za-z0-9_]"等效
	