(ns com.google.cloud.compute.v1.RoutersScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RoutersScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RoutersScopedList`

  returns: `com.google.cloud.compute.v1.RoutersScopedList$Builder`"
  (^com.google.cloud.compute.v1.RoutersScopedList$Builder [^RoutersScopedList$Builder this ^com.google.cloud.compute.v1.RoutersScopedList other]
    (-> this (.mergeFrom other))))

(defn get-routers-list
  "A list of routers contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Router>`"
  (^java.util.List [^RoutersScopedList$Builder this]
    (-> this (.getRoutersList))))

(defn add-all-routers
  "A list of routers contained in this scope.

  routers - `java.util.List`

  returns: `com.google.cloud.compute.v1.RoutersScopedList$Builder`"
  (^com.google.cloud.compute.v1.RoutersScopedList$Builder [^RoutersScopedList$Builder this ^java.util.List routers]
    (-> this (.addAllRouters routers))))

(defn add-routers
  "A list of routers contained in this scope.

  routers - `com.google.cloud.compute.v1.Router`

  returns: `com.google.cloud.compute.v1.RoutersScopedList$Builder`"
  (^com.google.cloud.compute.v1.RoutersScopedList$Builder [^RoutersScopedList$Builder this ^com.google.cloud.compute.v1.Router routers]
    (-> this (.addRouters routers))))

(defn get-warning
  "Informational warning which replaces the list of routers when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^RoutersScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "Informational warning which replaces the list of routers when the list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.RoutersScopedList$Builder`"
  (^com.google.cloud.compute.v1.RoutersScopedList$Builder [^RoutersScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.RoutersScopedList`"
  (^com.google.cloud.compute.v1.RoutersScopedList [^RoutersScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RoutersScopedList$Builder`"
  (^com.google.cloud.compute.v1.RoutersScopedList$Builder [^RoutersScopedList$Builder this]
    (-> this (.clone))))

