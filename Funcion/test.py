import pytest
from two_sum import two_sum

def test_pareja_valida():
    assert two_sum([2, 7, 11, 15], 9) == (0, 1)
    assert two_sum([3, 2, 4], 6) == (1, 2)
    assert two_sum([1, 3, 3], 6) == (1, 2)

def test_lista_vacia():
    assert two_sum([], 10) is None

def test_sin_coincidencias():
    assert two_sum([1, 2, 3], 10) is None

def test_duplicados_funciona():
    assert two_sum([5, 5, 2], 10) == (0, 1)

def test_valores_negativos():
    assert two_sum([-1, -2, -3, -4], -6) == (1, 3)

def test_entrada_invalida_tipo_lista():
    with pytest.raises(ValueError):
        two_sum("no es una lista", 10)

def test_entrada_invalida_elemento_no_entero():
    with pytest.raises(ValueError):
        two_sum([1, "a", 3], 4)

def test_entrada_invalida_target():
    with pytest.raises(ValueError):
        two_sum([1, 2, 3], "4")
