(ns com.google.cloud.compute.v1.BackendServicesScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendServicesScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.BackendServicesScopedList`

  returns: `com.google.cloud.compute.v1.BackendServicesScopedList$Builder`"
  (^com.google.cloud.compute.v1.BackendServicesScopedList$Builder [^BackendServicesScopedList$Builder this ^com.google.cloud.compute.v1.BackendServicesScopedList other]
    (-> this (.mergeFrom other))))

(defn get-backend-services-list
  "A list of BackendServices contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.BackendService>`"
  (^java.util.List [^BackendServicesScopedList$Builder this]
    (-> this (.getBackendServicesList))))

(defn add-all-backend-services
  "A list of BackendServices contained in this scope.

  backend-services - `java.util.List`

  returns: `com.google.cloud.compute.v1.BackendServicesScopedList$Builder`"
  (^com.google.cloud.compute.v1.BackendServicesScopedList$Builder [^BackendServicesScopedList$Builder this ^java.util.List backend-services]
    (-> this (.addAllBackendServices backend-services))))

(defn add-backend-services
  "A list of BackendServices contained in this scope.

  backend-services - `com.google.cloud.compute.v1.BackendService`

  returns: `com.google.cloud.compute.v1.BackendServicesScopedList$Builder`"
  (^com.google.cloud.compute.v1.BackendServicesScopedList$Builder [^BackendServicesScopedList$Builder this ^com.google.cloud.compute.v1.BackendService backend-services]
    (-> this (.addBackendServices backend-services))))

(defn get-warning
  "Informational warning which replaces the list of backend services when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^BackendServicesScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "Informational warning which replaces the list of backend services when the list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.BackendServicesScopedList$Builder`"
  (^com.google.cloud.compute.v1.BackendServicesScopedList$Builder [^BackendServicesScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.BackendServicesScopedList`"
  (^com.google.cloud.compute.v1.BackendServicesScopedList [^BackendServicesScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.BackendServicesScopedList$Builder`"
  (^com.google.cloud.compute.v1.BackendServicesScopedList$Builder [^BackendServicesScopedList$Builder this]
    (-> this (.clone))))

