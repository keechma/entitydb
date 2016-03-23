(ns entitydb.test.test
  (:require [doo.runner :refer-macros [doo-tests]]
            [cljs.test :as test]
            [entitydb.test.core]))

(doo-tests 'entitydb.test.core)