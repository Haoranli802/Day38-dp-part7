# Day38-dp-part7

● 139.单词拆分 

先把List的单词放入set或者map方便比较，然后遍历字符判断每个单词是否在字典里面，如果在的话同时判断前面的字符串是否符合条件，如果都符合那么当前字符串也符合条件。

也可以遍历字符串的同时遍历字典，对比字典字符和当前字符的一部分，如果相等，那么在判断之前部分是否符合条件，两者都符合的话整个字符串符合条件。

● 关于多重背包，你该了解这些！ 

多重背包的话需要在遍历的时候再加上一个个数遍历。

● 背包问题总结篇！
