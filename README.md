# Competition

多语言项目骨架仓库（INTERCITY HACK · 杭甬温三城联动黑客松）。

本仓库用于存放参赛过程中涉及的多语言示例代码与项目原型，包含 **C++、Java、Python、Godot** 四种语言的初始骨架，方便在比赛期间快速搭建原型、测试算法与协作开发。

## 目录结构

```
competition/
├── README.md
├── cpp/                  # C++ 示例
│   ├── main.cpp
│   └── CMakeLists.txt
├── java/                 # Java 示例
│   └── Main.java
├── python/               # Python 示例
│   ├── main.py
│   └── requirements.txt
└── godot/                # Godot 游戏引擎示例
    ├── project.godot
    └── scripts/
        └── main.gd
```

## 各语言说明

| 语言 | 目录 | 说明 |
|------|------|------|
| C++  | `cpp/`  | 竞赛/算法示例，CMake 构建 |
| Java | `java/` | 面向对象示例，命令行编译运行 |
| Python | `python/` | 脚本/数据处理示例，pip 依赖 |
| Godot | `godot/` | GDScript 游戏脚本示例 |

## 运行方式

### C++
```bash
cd cpp
cmake -S . -B build
cmake --build build
./build/main
```

### Java
```bash
cd java
javac Main.java
java Main
```

### Python
```bash
cd python
pip install -r requirements.txt
python main.py
```

### Godot
用 Godot 编辑器打开 `godot/` 目录即可运行场景。

## License

本仓库代码仅供学习与参赛使用，可自由使用。
