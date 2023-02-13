package org.tjl.hello.service.impl;

import org.tjl.hello.service.ISplitService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ISplitServiceImpl implements ISplitService {
    @Override
    public List<String> split(String value) {
        return Stream.of(value.split(",")).collect(Collectors.toList());
    }
}
