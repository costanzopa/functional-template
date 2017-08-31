(ns exercise7)

(defmulti fmap (fn [x y] [(class y)]))

(defmethod  fmap [clojure.lang.PersistentList] [x y]
  (map x (into [] y)))

(defmethod  fmap :default [x y]
  (map x y))


(defmethod fmap [clojure.lang.PersistentArrayMap] [x y]
 (apply merge (map (fn [[k v]] {k (x v)}) y)))