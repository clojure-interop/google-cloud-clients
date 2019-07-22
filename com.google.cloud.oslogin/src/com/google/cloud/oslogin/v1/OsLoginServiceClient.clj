(ns com.google.cloud.oslogin.v1.OsLoginServiceClient
  "Service Description: Cloud OS Login API

  The Cloud OS Login API allows you to manage users and their associated SSH public keys for
  logging into virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
    ProjectName name = ProjectName.of(\"[USER]\", \"[PROJECT]\");
    osLoginServiceClient.deletePosixAccount(name);
  }

  Note: close() needs to be called on the osLoginServiceClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of OsLoginServiceSettings to
  create(). For example:

  To customize credentials:



  OsLoginServiceSettings osLoginServiceSettings =
      OsLoginServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  OsLoginServiceClient osLoginServiceClient =
      OsLoginServiceClient.create(osLoginServiceSettings);

  To customize the endpoint:



  OsLoginServiceSettings osLoginServiceSettings =
      OsLoginServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  OsLoginServiceClient osLoginServiceClient =
      OsLoginServiceClient.create(osLoginServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.oslogin.v1 OsLoginServiceClient]))

(defn *create
  "Constructs an instance of OsLoginServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.oslogin.v1.OsLoginServiceSettings`

  returns: `com.google.cloud.oslogin.v1.OsLoginServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.oslogin.v1.OsLoginServiceClient [^com.google.cloud.oslogin.v1.OsLoginServiceSettings settings]
    (OsLoginServiceClient/create settings))
  (^com.google.cloud.oslogin.v1.OsLoginServiceClient []
    (OsLoginServiceClient/create )))

(defn get-ssh-public-key-callable
  "Retrieves an SSH public key.

   Sample code:



   try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
     FingerprintName name = FingerprintName.of(\"[USER]\", \"[FINGERPRINT]\");
     GetSshPublicKeyRequest request = GetSshPublicKeyRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<SshPublicKey> future = osLoginServiceClient.getSshPublicKeyCallable().futureCall(request);
     // Do something
     SshPublicKey response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.GetSshPublicKeyRequest,com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^OsLoginServiceClient this]
    (-> this (.getSshPublicKeyCallable))))

(defn delete-ssh-public-key
  "Deletes an SSH public key.

   Sample code:



   try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
     FingerprintName name = FingerprintName.of(\"[USER]\", \"[FINGERPRINT]\");
     osLoginServiceClient.deleteSshPublicKey(name);
   }

  name - The fingerprint of the public key to update. Public keys are identified by their SHA-256 fingerprint. The fingerprint of the public key is in format `users/{user}/sshPublicKeys/{fingerprint}`. - `com.google.cloud.oslogin.v1.FingerprintName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^OsLoginServiceClient this ^com.google.cloud.oslogin.v1.FingerprintName name]
    (-> this (.deleteSshPublicKey name))))

(defn get-login-profile
  "Retrieves the profile information used for logging in to a virtual machine on Google Compute
   Engine.

   Sample code:



   try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
     UserName name = UserName.of(\"[USER]\");
     LoginProfile response = osLoginServiceClient.getLoginProfile(name);
   }

  name - The unique ID for the user in format `users/{user}`. - `com.google.cloud.oslogin.v1.UserName`

  returns: `com.google.cloud.oslogin.v1.LoginProfile`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.oslogin.v1.LoginProfile [^OsLoginServiceClient this ^com.google.cloud.oslogin.v1.UserName name]
    (-> this (.getLoginProfile name))))

(defn delete-posix-account
  "Deletes a POSIX account.

   Sample code:



   try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[USER]\", \"[PROJECT]\");
     osLoginServiceClient.deletePosixAccount(name);
   }

  name - A reference to the POSIX account to update. POSIX accounts are identified by the project ID they are associated with. A reference to the POSIX account is in format `users/{user}/projects/{project}`. - `com.google.cloud.oslogin.v1.ProjectName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^OsLoginServiceClient this ^com.google.cloud.oslogin.v1.ProjectName name]
    (-> this (.deletePosixAccount name))))

(defn get-settings
  "returns: `com.google.cloud.oslogin.v1.OsLoginServiceSettings`"
  (^com.google.cloud.oslogin.v1.OsLoginServiceSettings [^OsLoginServiceClient this]
    (-> this (.getSettings))))

(defn delete-posix-account-callable
  "Deletes a POSIX account.

   Sample code:



   try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[USER]\", \"[PROJECT]\");
     DeletePosixAccountRequest request = DeletePosixAccountRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = osLoginServiceClient.deletePosixAccountCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.DeletePosixAccountRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^OsLoginServiceClient this]
    (-> this (.deletePosixAccountCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.oslogin.v1.stub.OsLoginServiceStub`"
  ([^OsLoginServiceClient this]
    (-> this (.getStub))))

(defn update-ssh-public-key
  "Updates an SSH public key and returns the profile information. This method supports patch
   semantics.

   Sample code:



   try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
     FingerprintName name = FingerprintName.of(\"[USER]\", \"[FINGERPRINT]\");
     SshPublicKey sshPublicKey = SshPublicKey.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     SshPublicKey response = osLoginServiceClient.updateSshPublicKey(name, sshPublicKey, updateMask);
   }

  name - The fingerprint of the public key to update. Public keys are identified by their SHA-256 fingerprint. The fingerprint of the public key is in format `users/{user}/sshPublicKeys/{fingerprint}`. - `com.google.cloud.oslogin.v1.FingerprintName`
  ssh-public-key - The SSH public key and expiration time. - `com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey`
  update-mask - Mask to control which fields get updated. Updates all if not present. - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey [^OsLoginServiceClient this ^com.google.cloud.oslogin.v1.FingerprintName name ^com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey ssh-public-key ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateSshPublicKey name ssh-public-key update-mask)))
  (^com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey [^OsLoginServiceClient this ^com.google.cloud.oslogin.v1.FingerprintName name ^com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey ssh-public-key]
    (-> this (.updateSshPublicKey name ssh-public-key)))
  (^com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey [^OsLoginServiceClient this ^com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest request]
    (-> this (.updateSshPublicKey request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^OsLoginServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^OsLoginServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^OsLoginServiceClient this]
    (-> this (.shutdown))))

(defn get-ssh-public-key
  "Retrieves an SSH public key.

   Sample code:



   try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
     FingerprintName name = FingerprintName.of(\"[USER]\", \"[FINGERPRINT]\");
     SshPublicKey response = osLoginServiceClient.getSshPublicKey(name);
   }

  name - The fingerprint of the public key to retrieve. Public keys are identified by their SHA-256 fingerprint. The fingerprint of the public key is in format `users/{user}/sshPublicKeys/{fingerprint}`. - `com.google.cloud.oslogin.v1.FingerprintName`

  returns: `com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey [^OsLoginServiceClient this ^com.google.cloud.oslogin.v1.FingerprintName name]
    (-> this (.getSshPublicKey name))))

(defn get-login-profile-callable
  "Retrieves the profile information used for logging in to a virtual machine on Google Compute
   Engine.

   Sample code:



   try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
     UserName name = UserName.of(\"[USER]\");
     GetLoginProfileRequest request = GetLoginProfileRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<LoginProfile> future = osLoginServiceClient.getLoginProfileCallable().futureCall(request);
     // Do something
     LoginProfile response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.GetLoginProfileRequest,com.google.cloud.oslogin.v1.LoginProfile>`"
  (^com.google.api.gax.rpc.UnaryCallable [^OsLoginServiceClient this]
    (-> this (.getLoginProfileCallable))))

(defn close
  ""
  ([^OsLoginServiceClient this]
    (-> this (.close))))

(defn import-ssh-public-key-callable
  "Adds an SSH public key and returns the profile information. Default POSIX account information
   is set when no username and UID exist as part of the login profile.

   Sample code:



   try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
     UserName parent = UserName.of(\"[USER]\");
     SshPublicKey sshPublicKey = SshPublicKey.newBuilder().build();
     ImportSshPublicKeyRequest request = ImportSshPublicKeyRequest.newBuilder()
       .setParent(parent.toString())
       .setSshPublicKey(sshPublicKey)
       .build();
     ApiFuture<ImportSshPublicKeyResponse> future = osLoginServiceClient.importSshPublicKeyCallable().futureCall(request);
     // Do something
     ImportSshPublicKeyResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest,com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^OsLoginServiceClient this]
    (-> this (.importSshPublicKeyCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^OsLoginServiceClient this]
    (-> this (.isTerminated))))

(defn import-ssh-public-key
  "Adds an SSH public key and returns the profile information. Default POSIX account information
   is set when no username and UID exist as part of the login profile.

   Sample code:



   try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
     UserName parent = UserName.of(\"[USER]\");
     SshPublicKey sshPublicKey = SshPublicKey.newBuilder().build();
     String projectId = \"\";
     ImportSshPublicKeyResponse response = osLoginServiceClient.importSshPublicKey(parent, sshPublicKey, projectId);
   }

  parent - The unique ID for the user in format `users/{user}`. - `com.google.cloud.oslogin.v1.UserName`
  ssh-public-key - The SSH public key and expiration time. - `com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey`
  project-id - The project ID of the Google Cloud Platform project. - `java.lang.String`

  returns: `com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse [^OsLoginServiceClient this ^com.google.cloud.oslogin.v1.UserName parent ^com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey ssh-public-key ^java.lang.String project-id]
    (-> this (.importSshPublicKey parent ssh-public-key project-id)))
  (^com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse [^OsLoginServiceClient this ^com.google.cloud.oslogin.v1.UserName parent ^com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey ssh-public-key]
    (-> this (.importSshPublicKey parent ssh-public-key)))
  (^com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse [^OsLoginServiceClient this ^com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest request]
    (-> this (.importSshPublicKey request))))

(defn delete-ssh-public-key-callable
  "Deletes an SSH public key.

   Sample code:



   try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
     FingerprintName name = FingerprintName.of(\"[USER]\", \"[FINGERPRINT]\");
     DeleteSshPublicKeyRequest request = DeleteSshPublicKeyRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = osLoginServiceClient.deleteSshPublicKeyCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^OsLoginServiceClient this]
    (-> this (.deleteSshPublicKeyCallable))))

(defn update-ssh-public-key-callable
  "Updates an SSH public key and returns the profile information. This method supports patch
   semantics.

   Sample code:



   try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
     FingerprintName name = FingerprintName.of(\"[USER]\", \"[FINGERPRINT]\");
     SshPublicKey sshPublicKey = SshPublicKey.newBuilder().build();
     UpdateSshPublicKeyRequest request = UpdateSshPublicKeyRequest.newBuilder()
       .setName(name.toString())
       .setSshPublicKey(sshPublicKey)
       .build();
     ApiFuture<SshPublicKey> future = osLoginServiceClient.updateSshPublicKeyCallable().futureCall(request);
     // Do something
     SshPublicKey response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest,com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^OsLoginServiceClient this]
    (-> this (.updateSshPublicKeyCallable))))

(defn shutdown-now
  ""
  ([^OsLoginServiceClient this]
    (-> this (.shutdownNow))))

