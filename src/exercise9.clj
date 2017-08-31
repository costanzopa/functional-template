(ns exercise9)


(defmulti things (fn [y] [(class y)]))

(defmethod  things [java.lang.String] [y]
  (str "Soy un String"))

(defmethod  things [clojure.lang.PersistentVector] [y]
  (str  "Soy un Vector"))

(defmethod things [clojure.lang.PersistentArrayMap] [y]
  (str "Soy un Map"))

(defmethod things :default [y]
  (str "Soy un default"))

