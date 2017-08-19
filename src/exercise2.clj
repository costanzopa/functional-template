(ns exercise2)

(defn is-greater-than-five?
  "Determines if x is greater than five."
  [x]
  (< 5 x)
  )

(defn only-greater-than-five [x]
  "Only accept values greater than five."
  (filter is-greater-than-five? x)
  )