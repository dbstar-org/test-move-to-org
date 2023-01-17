# 将项目从个人迁移到组织的步骤

### 转移所有权

在`项目首页` --> `Settings` --> `General`页面的最下方，`Danger Zone`区域内，点击`Transfer`按钮来开始`Transfer ownership`操作。

---

### 修改仓库地址

在项目的根目录下的`pom.xml`中：

替换`<url>`中的用户ID为组织ID
```xml
  <url>https://github.com/dbstar-org/test-move-to-org</url>
```

增加设置`project.git.group`属性为组织ID
```xml
  <properties>
    <project.git.project>test-move-to-org</project.git.project>
    <project.git.group>dbstar-org</project.git.group>
  </properties>
```