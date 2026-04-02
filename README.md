# CleanPasteGuard 🛡️

**CleanPasteGuard** 是一个为开发者设计的轻量级 PyCharm/IntelliJ 插件，旨在彻底解决从 WPS、Word 或网页复制代码时带入的“隐形垃圾字符”问题。

---

## 🌟 解决的痛点

你是否遇到过：从文档粘贴代码到编辑器，明明看起来没问题，运行却报错 `SyntaxError: invalid non-printable character U+00A0`？

这是因为这些软件会在空格处插入 **NBSP (Non-breaking space)**。本插件可以一键清除它们！

### 核心功能：
- ✅ **自动替换 NBSP (\u00A0)** 为标准空格。
- ✅ **转换全角空格 (\u3000)** 为标准空格。
- ✅ **修正中文标点**：自动将中文字符中的 `“ ”` `；` 替换为英文代码通用的 ` " " ` `;`。
- ✅ **智能识别**：支持全选清洗，或仅针对选中的代码段进行清洗。

---

## 🚀 安装方法

由于插件尚未发布到 Marketplace，目前请使用本地安装：

1. 在本仓库的 [Releases](./releases) 页面下载最新的 `.zip` 压缩包。
2. 打开你的 IDE (PyCharm/IDEA/WebStorm)。
3. 进入 `Settings` -> `Plugins`。
4. 点击顶部的 ⚙️ (齿轮图标)，选择 **"Install Plugin from Disk..."**。
5. 选中下载的 `.zip` 文件并重启 IDE。

---

## ⌨️ 如何使用

1. **选中**你需要清洗的代码块（或者不选中，默认清洗全文件）。
2. 按下快捷键：`Ctrl + Alt + Shift + S` (可在 Keymap 中自定义)。
3. **完成！** 所有的报错字符将瞬间变回标准的编程字符。

---

## 🛠️ 技术路线

- 语言：Java
- 平台：IntelliJ Platform Plugin SDK
- 开源协议：MIT

---

## 🤝 贡献与反馈

如果你发现了其他令人头疼的字符，欢迎提交 [Issue](./issues) 或 Pull Request！