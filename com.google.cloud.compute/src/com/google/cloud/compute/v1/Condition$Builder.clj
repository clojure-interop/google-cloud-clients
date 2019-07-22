(ns com.google.cloud.compute.v1.Condition$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Condition$Builder]))

(defn set-op
  "An operator to apply the subject with.

  op - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Condition$Builder`"
  (^com.google.cloud.compute.v1.Condition$Builder [^Condition$Builder this ^java.lang.String op]
    (-> this (.setOp op))))

(defn add-all-values
  "The objects of the condition.

  values - `java.util.List`

  returns: `com.google.cloud.compute.v1.Condition$Builder`"
  (^com.google.cloud.compute.v1.Condition$Builder [^Condition$Builder this ^java.util.List values]
    (-> this (.addAllValues values))))

(defn get-values-list
  "The objects of the condition.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Condition$Builder this]
    (-> this (.getValuesList))))

(defn get-sys
  "Trusted attributes supplied by any service that owns resources and uses the IAM system for
   access control.

  returns: `java.lang.String`"
  (^java.lang.String [^Condition$Builder this]
    (-> this (.getSys))))

(defn get-svc
  "Trusted attributes discharged by the service.

  returns: `java.lang.String`"
  (^java.lang.String [^Condition$Builder this]
    (-> this (.getSvc))))

(defn set-svc
  "Trusted attributes discharged by the service.

  svc - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Condition$Builder`"
  (^com.google.cloud.compute.v1.Condition$Builder [^Condition$Builder this ^java.lang.String svc]
    (-> this (.setSvc svc))))

(defn build
  "returns: `com.google.cloud.compute.v1.Condition`"
  (^com.google.cloud.compute.v1.Condition [^Condition$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Condition`

  returns: `com.google.cloud.compute.v1.Condition$Builder`"
  (^com.google.cloud.compute.v1.Condition$Builder [^Condition$Builder this ^com.google.cloud.compute.v1.Condition other]
    (-> this (.mergeFrom other))))

(defn add-values
  "The objects of the condition.

  values - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Condition$Builder`"
  (^com.google.cloud.compute.v1.Condition$Builder [^Condition$Builder this ^java.lang.String values]
    (-> this (.addValues values))))

(defn get-iam
  "Trusted attributes supplied by the IAM system.

  returns: `java.lang.String`"
  (^java.lang.String [^Condition$Builder this]
    (-> this (.getIam))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Condition$Builder`"
  (^com.google.cloud.compute.v1.Condition$Builder [^Condition$Builder this]
    (-> this (.clone))))

(defn get-op
  "An operator to apply the subject with.

  returns: `java.lang.String`"
  (^java.lang.String [^Condition$Builder this]
    (-> this (.getOp))))

(defn set-iam
  "Trusted attributes supplied by the IAM system.

  iam - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Condition$Builder`"
  (^com.google.cloud.compute.v1.Condition$Builder [^Condition$Builder this ^java.lang.String iam]
    (-> this (.setIam iam))))

(defn set-sys
  "Trusted attributes supplied by any service that owns resources and uses the IAM system for
   access control.

  sys - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Condition$Builder`"
  (^com.google.cloud.compute.v1.Condition$Builder [^Condition$Builder this ^java.lang.String sys]
    (-> this (.setSys sys))))

