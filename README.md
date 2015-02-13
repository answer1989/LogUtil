# LogUtil
simple log util

origin idea is from google io client source code, and i add some more in it, which is helpful in our project.

```
//log with a tag
LogUtils.LOGD("test","my message");
//log only message, and the tag is your current class name
LogUtils.LOGE("test message");
//call this can print method call level
LogUtils.LOGD("test message", new Throwable());
//call this will log to local file
LogUtils.LogToFile("test test");
```
