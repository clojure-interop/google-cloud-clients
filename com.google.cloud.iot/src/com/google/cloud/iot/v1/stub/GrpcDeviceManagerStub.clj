(ns com.google.cloud.iot.v1.stub.GrpcDeviceManagerStub
  "gRPC stub implementation for Cloud IoT API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.iot.v1.stub GrpcDeviceManagerStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.iot.v1.stub.GrpcDeviceManagerStub`

  throws: java.io.IOException"
  (^com.google.cloud.iot.v1.stub.GrpcDeviceManagerStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcDeviceManagerStub/create client-context callable-factory))
  (^com.google.cloud.iot.v1.stub.GrpcDeviceManagerStub [^com.google.cloud.iot.v1.stub.DeviceManagerStubSettings settings]
    (GrpcDeviceManagerStub/create settings)))

(defn bind-device-to-gateway-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.BindDeviceToGatewayRequest,com.google.cloud.iot.v1.BindDeviceToGatewayResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.bindDeviceToGatewayCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.getIamPolicyCallable))))

(defn list-device-states-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDeviceStatesRequest,com.google.cloud.iot.v1.ListDeviceStatesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.listDeviceStatesCallable))))

(defn create-device-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.CreateDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.createDeviceCallable))))

(defn list-devices-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDevicesRequest,com.google.cloud.iot.v1.DeviceManagerClient$ListDevicesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.listDevicesPagedCallable))))

(defn list-device-registries-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDeviceRegistriesRequest,com.google.cloud.iot.v1.ListDeviceRegistriesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.listDeviceRegistriesCallable))))

(defn delete-device-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.DeleteDeviceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.deleteDeviceCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcDeviceManagerStub this]
    (-> this (.isShutdown))))

(defn send-command-to-device-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.SendCommandToDeviceRequest,com.google.cloud.iot.v1.SendCommandToDeviceResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.sendCommandToDeviceCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcDeviceManagerStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-device-registries-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDeviceRegistriesRequest,com.google.cloud.iot.v1.DeviceManagerClient$ListDeviceRegistriesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.listDeviceRegistriesPagedCallable))))

(defn shutdown
  ""
  ([^GrpcDeviceManagerStub this]
    (-> this (.shutdown))))

(defn unbind-device-from-gateway-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.UnbindDeviceFromGatewayRequest,com.google.cloud.iot.v1.UnbindDeviceFromGatewayResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.unbindDeviceFromGatewayCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.setIamPolicyCallable))))

(defn list-device-config-versions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDeviceConfigVersionsRequest,com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.listDeviceConfigVersionsCallable))))

(defn close
  ""
  ([^GrpcDeviceManagerStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.testIamPermissionsCallable))))

(defn get-device-registry-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.GetDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.getDeviceRegistryCallable))))

(defn list-devices-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDevicesRequest,com.google.cloud.iot.v1.ListDevicesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.listDevicesCallable))))

(defn get-device-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.GetDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.getDeviceCallable))))

(defn update-device-registry-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.UpdateDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.updateDeviceRegistryCallable))))

(defn modify-cloud-to-device-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ModifyCloudToDeviceConfigRequest,com.google.cloud.iot.v1.DeviceConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.modifyCloudToDeviceConfigCallable))))

(defn create-device-registry-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.CreateDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.createDeviceRegistryCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcDeviceManagerStub this]
    (-> this (.isTerminated))))

(defn delete-device-registry-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.DeleteDeviceRegistryRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.deleteDeviceRegistryCallable))))

(defn shutdown-now
  ""
  ([^GrpcDeviceManagerStub this]
    (-> this (.shutdownNow))))

(defn update-device-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.UpdateDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDeviceManagerStub this]
    (-> this (.updateDeviceCallable))))

