(ns com.google.cloud.resourcemanager.ResourceManagerException
  "Resource Manager service exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager ResourceManagerException]))

(defn ->resource-manager-exception
  "Constructor.

  code - `int`
  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^ResourceManagerException [^Integer code ^java.lang.String message ^java.lang.Throwable cause]
    (new ResourceManagerException code message cause))
  (^ResourceManagerException [^Integer code ^java.lang.String message]
    (new ResourceManagerException code message))
  (^ResourceManagerException [^java.io.IOException exception]
    (new ResourceManagerException exception)))

