(ns com.google.cloud.compute.v1.Reference$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Reference$Builder]))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#reference for references.

  returns: `java.lang.String`"
  (^java.lang.String [^Reference$Builder this]
    (-> this (.getKind))))

(defn set-reference-type
  "A description of the reference type with no implied semantics. Possible values include: -
   MEMBER_OF

  reference-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Reference$Builder`"
  (^com.google.cloud.compute.v1.Reference$Builder [^Reference$Builder this ^java.lang.String reference-type]
    (-> this (.setReferenceType reference-type))))

(defn set-referrer
  "URL of the resource which refers to the target.

  referrer - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Reference$Builder`"
  (^com.google.cloud.compute.v1.Reference$Builder [^Reference$Builder this ^java.lang.String referrer]
    (-> this (.setReferrer referrer))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#reference for references.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Reference$Builder`"
  (^com.google.cloud.compute.v1.Reference$Builder [^Reference$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn build
  "returns: `com.google.cloud.compute.v1.Reference`"
  (^com.google.cloud.compute.v1.Reference [^Reference$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Reference`

  returns: `com.google.cloud.compute.v1.Reference$Builder`"
  (^com.google.cloud.compute.v1.Reference$Builder [^Reference$Builder this ^com.google.cloud.compute.v1.Reference other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Reference$Builder`"
  (^com.google.cloud.compute.v1.Reference$Builder [^Reference$Builder this]
    (-> this (.clone))))

(defn get-target
  "URL of the resource to which this reference points.

  returns: `java.lang.String`"
  (^java.lang.String [^Reference$Builder this]
    (-> this (.getTarget))))

(defn get-referrer
  "URL of the resource which refers to the target.

  returns: `java.lang.String`"
  (^java.lang.String [^Reference$Builder this]
    (-> this (.getReferrer))))

(defn set-target
  "URL of the resource to which this reference points.

  target - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Reference$Builder`"
  (^com.google.cloud.compute.v1.Reference$Builder [^Reference$Builder this ^java.lang.String target]
    (-> this (.setTarget target))))

(defn get-reference-type
  "A description of the reference type with no implied semantics. Possible values include: -
   MEMBER_OF

  returns: `java.lang.String`"
  (^java.lang.String [^Reference$Builder this]
    (-> this (.getReferenceType))))

