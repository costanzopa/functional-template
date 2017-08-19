(ns exercise3)

(defn fibonacci
  "Determines the fibonacci sequence."
  [x]
  (cond
    (= 0 x) 0
    (= 1 x) 1
    (> x 1) (+ (fibonacci (- x 1)) (fibonacci (- x 2)))
    )
  )