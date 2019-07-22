(ns com.google.cloud.compute.v1.RouterNatLogConfig$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterNatLogConfig$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RouterNatLogConfig`

  returns: `com.google.cloud.compute.v1.RouterNatLogConfig$Builder`"
  (^com.google.cloud.compute.v1.RouterNatLogConfig$Builder [^RouterNatLogConfig$Builder this ^com.google.cloud.compute.v1.RouterNatLogConfig other]
    (-> this (.mergeFrom other))))

(defn get-enable?
  "Indicates whether or not to export logs. This is false by default.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^RouterNatLogConfig$Builder this]
    (-> this (.getEnable))))

(defn set-enable
  "Indicates whether or not to export logs. This is false by default.

  enable - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.RouterNatLogConfig$Builder`"
  (^com.google.cloud.compute.v1.RouterNatLogConfig$Builder [^RouterNatLogConfig$Builder this ^java.lang.Boolean enable]
    (-> this (.setEnable enable))))

(defn get-filter
  "Specifies the desired filtering of logs on this NAT. If unspecified, logs are exported for
   all connections handled by this NAT.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterNatLogConfig$Builder this]
    (-> this (.getFilter))))

(defn set-filter
  "Specifies the desired filtering of logs on this NAT. If unspecified, logs are exported for
   all connections handled by this NAT.

  filter - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterNatLogConfig$Builder`"
  (^com.google.cloud.compute.v1.RouterNatLogConfig$Builder [^RouterNatLogConfig$Builder this ^java.lang.String filter]
    (-> this (.setFilter filter))))

(defn build
  "returns: `com.google.cloud.compute.v1.RouterNatLogConfig`"
  (^com.google.cloud.compute.v1.RouterNatLogConfig [^RouterNatLogConfig$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RouterNatLogConfig$Builder`"
  (^com.google.cloud.compute.v1.RouterNatLogConfig$Builder [^RouterNatLogConfig$Builder this]
    (-> this (.clone))))

