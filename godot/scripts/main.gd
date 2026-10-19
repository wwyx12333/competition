# GDScript 示例：主场景脚本
# 按方向键移动一个节点，空格键打印当前坐标
extends Node2D

@export var move_speed: float = 200.0

func _process(delta: float) -> void:
    var input_vector := Vector2.ZERO
    if Input.is_action_pressed("ui_left"):
        input_vector.x -= 1.0
    if Input.is_action_pressed("ui_right"):
        input_vector.x += 1.0
    if Input.is_action_pressed("ui_up"):
        input_vector.y -= 1.0
    if Input.is_action_pressed("ui_down"):
        input_vector.y += 1.0

    position += input_vector.normalized() * move_speed * delta

    if Input.is_action_just_pressed("ui_accept"):
        print("当前位置: ", position)
