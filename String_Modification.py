#String modification
input_string = input("Enter any string")
def add_string(input_string):
  length = len(input_string)

  if length > 2:
    if str1[-3:] == 'ing':
      str1 += 'ly'
    else:
      str1 += 'ing'

  return str1
#Test Cases
input_string = "Hello there"
input_string = "how are you doing"
input_string = "doing something"
