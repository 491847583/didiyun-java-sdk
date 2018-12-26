// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/ebs.proto

package com.didiyun.compute.v1;

/**
 * Protobuf type {@code didi.cloud.compute.v1.GetEbsTotalCntResponse}
 */
public  final class GetEbsTotalCntResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.compute.v1.GetEbsTotalCntResponse)
    GetEbsTotalCntResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetEbsTotalCntResponse.newBuilder() to construct.
  private GetEbsTotalCntResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetEbsTotalCntResponse() {
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetEbsTotalCntResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.didiyun.base.v1.Error.Builder subBuilder = null;
            if (error_ != null) {
              subBuilder = error_.toBuilder();
            }
            error_ = input.readMessage(com.didiyun.base.v1.Error.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(error_);
              error_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              data_ = new java.util.ArrayList<com.didiyun.compute.v1.TotalCntInfo>();
              mutable_bitField0_ |= 0x00000002;
            }
            data_.add(
                input.readMessage(com.didiyun.compute.v1.TotalCntInfo.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        data_ = java.util.Collections.unmodifiableList(data_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.compute.v1.EbsOuterClass.internal_static_didi_cloud_compute_v1_GetEbsTotalCntResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.compute.v1.EbsOuterClass.internal_static_didi_cloud_compute_v1_GetEbsTotalCntResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.compute.v1.GetEbsTotalCntResponse.class, com.didiyun.compute.v1.GetEbsTotalCntResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ERROR_FIELD_NUMBER = 1;
  private com.didiyun.base.v1.Error error_;
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  public boolean hasError() {
    return error_ != null;
  }
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  public com.didiyun.base.v1.Error getError() {
    return error_ == null ? com.didiyun.base.v1.Error.getDefaultInstance() : error_;
  }
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  public com.didiyun.base.v1.ErrorOrBuilder getErrorOrBuilder() {
    return getError();
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private java.util.List<com.didiyun.compute.v1.TotalCntInfo> data_;
  /**
   * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
   */
  public java.util.List<com.didiyun.compute.v1.TotalCntInfo> getDataList() {
    return data_;
  }
  /**
   * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
   */
  public java.util.List<? extends com.didiyun.compute.v1.TotalCntInfoOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
   */
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
   */
  public com.didiyun.compute.v1.TotalCntInfo getData(int index) {
    return data_.get(index);
  }
  /**
   * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
   */
  public com.didiyun.compute.v1.TotalCntInfoOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (error_ != null) {
      output.writeMessage(1, getError());
    }
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(2, data_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (error_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getError());
    }
    for (int i = 0; i < data_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, data_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.didiyun.compute.v1.GetEbsTotalCntResponse)) {
      return super.equals(obj);
    }
    com.didiyun.compute.v1.GetEbsTotalCntResponse other = (com.didiyun.compute.v1.GetEbsTotalCntResponse) obj;

    boolean result = true;
    result = result && (hasError() == other.hasError());
    if (hasError()) {
      result = result && getError()
          .equals(other.getError());
    }
    result = result && getDataList()
        .equals(other.getDataList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.compute.v1.GetEbsTotalCntResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.didiyun.compute.v1.GetEbsTotalCntResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code didi.cloud.compute.v1.GetEbsTotalCntResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.compute.v1.GetEbsTotalCntResponse)
      com.didiyun.compute.v1.GetEbsTotalCntResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.compute.v1.EbsOuterClass.internal_static_didi_cloud_compute_v1_GetEbsTotalCntResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.compute.v1.EbsOuterClass.internal_static_didi_cloud_compute_v1_GetEbsTotalCntResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.compute.v1.GetEbsTotalCntResponse.class, com.didiyun.compute.v1.GetEbsTotalCntResponse.Builder.class);
    }

    // Construct using com.didiyun.compute.v1.GetEbsTotalCntResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (errorBuilder_ == null) {
        error_ = null;
      } else {
        error_ = null;
        errorBuilder_ = null;
      }
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        dataBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.compute.v1.EbsOuterClass.internal_static_didi_cloud_compute_v1_GetEbsTotalCntResponse_descriptor;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.GetEbsTotalCntResponse getDefaultInstanceForType() {
      return com.didiyun.compute.v1.GetEbsTotalCntResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.compute.v1.GetEbsTotalCntResponse build() {
      com.didiyun.compute.v1.GetEbsTotalCntResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.GetEbsTotalCntResponse buildPartial() {
      com.didiyun.compute.v1.GetEbsTotalCntResponse result = new com.didiyun.compute.v1.GetEbsTotalCntResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (errorBuilder_ == null) {
        result.error_ = error_;
      } else {
        result.error_ = errorBuilder_.build();
      }
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.didiyun.compute.v1.GetEbsTotalCntResponse) {
        return mergeFrom((com.didiyun.compute.v1.GetEbsTotalCntResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.compute.v1.GetEbsTotalCntResponse other) {
      if (other == com.didiyun.compute.v1.GetEbsTotalCntResponse.getDefaultInstance()) return this;
      if (other.hasError()) {
        mergeError(other.getError());
      }
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
      } else {
        if (!other.data_.isEmpty()) {
          if (dataBuilder_.isEmpty()) {
            dataBuilder_.dispose();
            dataBuilder_ = null;
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000002);
            dataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataFieldBuilder() : null;
          } else {
            dataBuilder_.addAllMessages(other.data_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.didiyun.compute.v1.GetEbsTotalCntResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.compute.v1.GetEbsTotalCntResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.didiyun.base.v1.Error error_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Error, com.didiyun.base.v1.Error.Builder, com.didiyun.base.v1.ErrorOrBuilder> errorBuilder_;
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    public boolean hasError() {
      return errorBuilder_ != null || error_ != null;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    public com.didiyun.base.v1.Error getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.didiyun.base.v1.Error.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    public Builder setError(com.didiyun.base.v1.Error value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    public Builder setError(
        com.didiyun.base.v1.Error.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    public Builder mergeError(com.didiyun.base.v1.Error value) {
      if (errorBuilder_ == null) {
        if (error_ != null) {
          error_ =
            com.didiyun.base.v1.Error.newBuilder(error_).mergeFrom(value).buildPartial();
        } else {
          error_ = value;
        }
        onChanged();
      } else {
        errorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        error_ = null;
        onChanged();
      } else {
        error_ = null;
        errorBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    public com.didiyun.base.v1.Error.Builder getErrorBuilder() {
      
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    public com.didiyun.base.v1.ErrorOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ?
            com.didiyun.base.v1.Error.getDefaultInstance() : error_;
      }
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Error, com.didiyun.base.v1.Error.Builder, com.didiyun.base.v1.ErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.didiyun.base.v1.Error, com.didiyun.base.v1.Error.Builder, com.didiyun.base.v1.ErrorOrBuilder>(
                getError(),
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      return errorBuilder_;
    }

    private java.util.List<com.didiyun.compute.v1.TotalCntInfo> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        data_ = new java.util.ArrayList<com.didiyun.compute.v1.TotalCntInfo>(data_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.didiyun.compute.v1.TotalCntInfo, com.didiyun.compute.v1.TotalCntInfo.Builder, com.didiyun.compute.v1.TotalCntInfoOrBuilder> dataBuilder_;

    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public java.util.List<com.didiyun.compute.v1.TotalCntInfo> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public com.didiyun.compute.v1.TotalCntInfo getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public Builder setData(
        int index, com.didiyun.compute.v1.TotalCntInfo value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
      } else {
        dataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public Builder setData(
        int index, com.didiyun.compute.v1.TotalCntInfo.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public Builder addData(com.didiyun.compute.v1.TotalCntInfo value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(value);
        onChanged();
      } else {
        dataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public Builder addData(
        int index, com.didiyun.compute.v1.TotalCntInfo value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(index, value);
        onChanged();
      } else {
        dataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public Builder addData(
        com.didiyun.compute.v1.TotalCntInfo.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public Builder addData(
        int index, com.didiyun.compute.v1.TotalCntInfo.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends com.didiyun.compute.v1.TotalCntInfo> values) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
      } else {
        dataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public Builder removeData(int index) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.remove(index);
        onChanged();
      } else {
        dataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public com.didiyun.compute.v1.TotalCntInfo.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public com.didiyun.compute.v1.TotalCntInfoOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public java.util.List<? extends com.didiyun.compute.v1.TotalCntInfoOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public com.didiyun.compute.v1.TotalCntInfo.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          com.didiyun.compute.v1.TotalCntInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public com.didiyun.compute.v1.TotalCntInfo.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, com.didiyun.compute.v1.TotalCntInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .didi.cloud.compute.v1.TotalCntInfo data = 2;</code>
     */
    public java.util.List<com.didiyun.compute.v1.TotalCntInfo.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.didiyun.compute.v1.TotalCntInfo, com.didiyun.compute.v1.TotalCntInfo.Builder, com.didiyun.compute.v1.TotalCntInfoOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.didiyun.compute.v1.TotalCntInfo, com.didiyun.compute.v1.TotalCntInfo.Builder, com.didiyun.compute.v1.TotalCntInfoOrBuilder>(
                data_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:didi.cloud.compute.v1.GetEbsTotalCntResponse)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.compute.v1.GetEbsTotalCntResponse)
  private static final com.didiyun.compute.v1.GetEbsTotalCntResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.compute.v1.GetEbsTotalCntResponse();
  }

  public static com.didiyun.compute.v1.GetEbsTotalCntResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetEbsTotalCntResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetEbsTotalCntResponse>() {
    @java.lang.Override
    public GetEbsTotalCntResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetEbsTotalCntResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetEbsTotalCntResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetEbsTotalCntResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.compute.v1.GetEbsTotalCntResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

