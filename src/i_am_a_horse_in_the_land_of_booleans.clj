(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not  (or (= x false) (= x nil))))

(defn abs [x]
  (if (< 0 x) x (- x)))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (and (divides? 3 n) (divides? 5 n)) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (vector? x) (list? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (and
    (divides? 100 year)
    (not (divides? 400 year))) false
   (divides? 4 year) true
   :else false))


; '_______'
