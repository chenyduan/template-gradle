# gradle 项目
## todo
- 新增library官方插件


## gradle 与maven 功能对应
| maven                | gradle                            |
|----------------------|-----------------------------------|
| dependencyManagement | java-platform 插件，参考dependencies模块 |
| maven 项目中的公共模块       | Text                              |
｜应用模块｜application 插件，参考本项目application模块｜
1. 实现maven的  功能（BOM功能），统一管理依赖版本
> 参考gradle-dependencies模块   
> 
2. 