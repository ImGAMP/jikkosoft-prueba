from typing import List, Optional, Tuple

def two_sum(nums: List[int], target: int) -> Optional[Tuple[int, int]]:
    if not isinstance(nums, list) or not all(isinstance(n, int) for n in nums):
        raise ValueError("El argumento 'nums' debe ser una lista de enteros.")
    if not isinstance(target, int):
        raise ValueError("El argumento 'target' debe ser un entero.")

    seen = {} 

    for i, num in enumerate(nums):
        complemento = target - num
        if complemento in seen:
            return (seen[complemento], i)
        seen[num] = i

    return None
