def isValidSubsequence(array, sequence):
	array_index = 0
	sequence_index = 0
	while array_index < len(array) and sequence_index < len(sequence):
		if array[array_index] == sequence[sequence_index]:
			sequence_index += 1
		array_index += 1
	return sequence_index == len(sequence)
