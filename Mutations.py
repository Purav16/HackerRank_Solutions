def mutate_string(string, position, character):
    a = string[:int(position)] + character + string[int(position)+1:]
    return a