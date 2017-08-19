(ns exercise2)

(defn is-greater-than-five? [x]
  (< 5 x)
  )

(defn only-greater-than-five [x]
  (filter is-greater-than-five? x)
  )