# Sequence generator


Generator math:
```
n=0 => a(0) = 0
n=1 => a(1) = 1
n=2 => a(2) = 1
n>2 => a(n) = a(n-3) + a(n-2)
```

API call:

```
curl http://localhost:8080/alticci/71
```

The values are cached in `HashMap`

# TODO
 - add redis for cache layer
 - create submodules for easy maintenance.
