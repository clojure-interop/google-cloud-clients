(ns com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ShieldedInstanceIdentity$Builder]))

(defn set-encryption-key
  "An Endorsement Key (EK) issued to the Shielded Instance's vTPM.

  encryption-key - `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder [^ShieldedInstanceIdentity$Builder this ^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry encryption-key]
    (-> this (.setEncryptionKey encryption-key))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#shieldedInstanceIdentity for shielded
   Instance identity entry.

  returns: `java.lang.String`"
  (^java.lang.String [^ShieldedInstanceIdentity$Builder this]
    (-> this (.getKind))))

(defn get-signing-key
  "An Attestation Key (AK) issued to the Shielded Instance's vTPM.

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry [^ShieldedInstanceIdentity$Builder this]
    (-> this (.getSigningKey))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#shieldedInstanceIdentity for shielded
   Instance identity entry.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder [^ShieldedInstanceIdentity$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-signing-key
  "An Attestation Key (AK) issued to the Shielded Instance's vTPM.

  signing-key - `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder [^ShieldedInstanceIdentity$Builder this ^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry signing-key]
    (-> this (.setSigningKey signing-key))))

(defn build
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentity`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentity [^ShieldedInstanceIdentity$Builder this]
    (-> this (.build))))

(defn get-encryption-key
  "An Endorsement Key (EK) issued to the Shielded Instance's vTPM.

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry [^ShieldedInstanceIdentity$Builder this]
    (-> this (.getEncryptionKey))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ShieldedInstanceIdentity`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder [^ShieldedInstanceIdentity$Builder this ^com.google.cloud.compute.v1.ShieldedInstanceIdentity other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder [^ShieldedInstanceIdentity$Builder this]
    (-> this (.clone))))

