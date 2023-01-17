# 将项目从个人迁移到组织的步骤

### 转移所有权

在`项目首页` --> `Settings` --> `General`页面的最下方，`Danger Zone`区域内，点击`Transfer`按钮来开始`Transfer ownership`操作。

在转移所有权以后，请在将本地git仓库删除，然后从新的地址重新拉取。

---

### 修改`pom.xml`中定义的仓库地址

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

---

### 使用组织中定义的全局`Actions secrets`

删除项目中定义的`Actions secrets`，改为使用在组织中定义的全局`Actions secrets`，包括：
* `GPG_KEY`
* `GPG_PASSPHRASE`
* `GPG_PRIVATE_KEY`
* `OSS_USERNAME`
* `OSS_PASSWORD`
* `SONAR_HOST_URL`
* `SONAR_TOKEN`

项目中可以保留差异化的`Actions secrets`定义，例如：`SONAR_PROJECT_KEY`，或者项目专属的`SONAR_TOKEN`，可覆盖组织上定义的全局参数。

### 使用组织中定义的全局`Workflow`

删除项目中定义的通用`Workflow`脚本，改为使用组织中定义的全局`Workflow`，项目中的个性化`Workflow`脚本仍旧可以保留。


