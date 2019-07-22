(ns com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SubnetworksSetPrivateIpGoogleAccessRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest`

  returns: `com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest$Builder [^SubnetworksSetPrivateIpGoogleAccessRequest$Builder this ^com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest other]
    (-> this (.mergeFrom other))))

(defn get-private-ip-google-access?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^SubnetworksSetPrivateIpGoogleAccessRequest$Builder this]
    (-> this (.getPrivateIpGoogleAccess))))

(defn set-private-ip-google-access
  "private-ip-google-access - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest$Builder [^SubnetworksSetPrivateIpGoogleAccessRequest$Builder this ^java.lang.Boolean private-ip-google-access]
    (-> this (.setPrivateIpGoogleAccess private-ip-google-access))))

(defn build
  "returns: `com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest`"
  (^com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest [^SubnetworksSetPrivateIpGoogleAccessRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest$Builder [^SubnetworksSetPrivateIpGoogleAccessRequest$Builder this]
    (-> this (.clone))))

