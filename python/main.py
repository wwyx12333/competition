"""Python 示例：命令行工具，统计文本中的单词频率。"""
import argparse
import collections
import re


def word_frequency(text: str, top_n: int = 10) -> list[tuple[str, int]]:
    """统计文本中出现频率最高的 top_n 个单词。"""
    words = re.findall(r"[a-zA-Z']+", text.lower())
    counter = collections.Counter(words)
    return counter.most_common(top_n)


def main() -> None:
    parser = argparse.ArgumentParser(description="统计文本单词频率")
    parser.add_argument("text", nargs="?", default="hello world hello python",
                        help="要分析的文本")
    parser.add_argument("--top", type=int, default=10, help="显示前 N 个高频词")
    args = parser.parse_args()

    result = word_frequency(args.text, args.top)
    for word, count in result:
        print(f"{word:<12} {count}")


if __name__ == "__main__":
    main()
