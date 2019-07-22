(ns com.google.cloud.http.BaseHttpServiceException
  "Base class for all exceptions from http-based services."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.http BaseHttpServiceException]))

(def *-unknown-code
  "Static Constant.

  type: int"
  BaseHttpServiceException/UNKNOWN_CODE)

