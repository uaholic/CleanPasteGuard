package com.github.uaholic.cleanpasteguard;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class CleanAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        // 1. 获取当前编辑器对象
        Editor editor = e.getData(CommonDataKeys.EDITOR);
        Project project = e.getProject();

        if (editor == null || project == null) return;

        // 2. 获取文档对象
        Document document = editor.getDocument();
        String content = document.getText();

        // 3. 核心清洗逻辑：替换 NBSP 和 中文全角标点
        String cleanedContent = content.replace("\u00A0", " ") // 清洗 NBSP
                .replace("\u3000", " ") // 清洗全角空格
                .replace("“", "\"")      // 清洗中文引号
                .replace("”", "\"")
                .replace("；", ";");     // 清洗中文分号

        // 4. 写回编辑器
        WriteCommandAction.runWriteCommandAction(project, () -> {
            document.setText(cleanedContent);
        });
    }
}