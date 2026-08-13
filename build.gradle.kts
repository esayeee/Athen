plugins {
    alias(libs.plugins.loom)
    id("aerii")
}

// ⬇️ 添加仓库配置
repositories {
    mavenCentral()
    maven("https://maven.terraformersmc.com/releases/")  // ModMenu 官方仓库
    // 如果还有其他仓库（如 fabric、modrinth），保留在此
}

// ⬇️ 添加依赖配置
dependencies {
    // 修改 modmenu 为稳定版本
    modImplementation("com.terraformersmc:modmenu:11.0.1")
    // 你的其他依赖（如 minecraft, fabric loader 等）照旧
}
