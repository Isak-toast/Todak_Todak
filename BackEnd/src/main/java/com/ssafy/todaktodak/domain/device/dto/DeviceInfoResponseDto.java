package com.ssafy.todaktodak.domain.device.dto;

import com.ssafy.todaktodak.domain.device.domain.Device;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DeviceInfoResponseDto {
    private String serialNumber;

    private String sessionId;

    private String sessionToken;


    public static DeviceInfoResponseDto ofDevice(Device device) {

        return DeviceInfoResponseDto.builder()
                .serialNumber(device.getSerialNumber())
                .sessionToken(device.getConnectionId())
                .sessionId(device.getSessionId())
                .build();

    }



}
