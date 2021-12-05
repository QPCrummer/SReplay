package com.hadroncfy.sreplay.config;

import net.minecraft.text.ClickEvent;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.LiteralText;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.ClickEvent.Action;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos.Mutable;

public class Formats {
    private static MutableText red(String s){
        return new LiteralText(s).setStyle(Style.EMPTY.withColor(Formatting.RED));
    }
    private static MutableText green(String s){
        return new LiteralText(s).setStyle(Style.EMPTY.withColor(Formatting.GREEN));
    }
    private static MutableText white(String s){
        return new LiteralText(s).setStyle(Style.EMPTY.withColor(Formatting.WHITE));
    }
    private static MutableText yellow(String s){
        return new LiteralText(s).setStyle(Style.EMPTY.withColor(Formatting.YELLOW));
    }

    public Text playerNotFound = red("Player $1 not found (or not video robot)"),
    recordFileExists = red("The SReplay video file $1 already exists"),
    reloadedConfig = new LiteralText("The configuration is loaded"),
    failedToReloadConfig = red("Failed to load configuration: $1"),
    nothingToConfirm = red("There are no actions to confirm"),
    nothingToCancel = red("There is no action to cancel"),
    confirmingHint = new LiteralText("[SReplay] use")
        .append(new LiteralText("/sreplayer confirm $1").setStyle(Style.EMPTY.withColor(Formatting.GOLD)))
        .append(new LiteralText("to confirm this operation")),
    deletedRecordingFile = new LiteralText("SReplay $1: Deleted recording file $2"),
    failedToDeleteRecordingFile = red("(SReplay) $1: Delete the recording file $2 failed: $3"),
    operationCancelled = new LiteralText("[SReplay] The operation has been canceled"),
    incorrectConfirmationCode = red("[SReplay] The confirmation code does not match"),
    fileNotFound = red("[SReplay] File $1 does not exist"),
    teleportedBotToYou = new LiteralText("[SReplay] Has been")
        .append(new LiteralText("$1").setStyle(Style.EMPTY.withColor(Formatting.DARK_GRAY)))
        .append(new LiteralText("Transfer to $2")),
    invalidPlayerName = red("[SReplay] Illegal player name"),
    playerNameTooLong = red("[SReplay] Player name length can not exceed 16 (otherwise chunk ban!) ）"),
    playerIsLoggedIn = red("[SReplay] Player $1 is logged in"),
    failedToStartRecording = red("[SReplay] Failed to record: $1"),
    recordingFileListHead = new LiteralText("[SReplay] The list of recorded files："),
    recordingFileItem = new LiteralText("- $1($2M) ").setStyle(Style.EMPTY.withColor(Formatting.GREEN))
        .append(new LiteralText("[Download]").setStyle(Style.EMPTY.withColor(Formatting.BLUE).withClickEvent(
            new ClickEvent(Action.RUN_COMMAND, "/sreplay get $1")
        ).withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
            new LiteralText("Click to generate a download link").setStyle(Style.EMPTY.withItalic(true).withColor(Formatting.GRAY))
        ))))
        .append(new LiteralText("[Delete]").setStyle(Style.EMPTY.withColor(Formatting.RED).withClickEvent(
            new ClickEvent(Action.RUN_COMMAND, "/sreplay delete $1")
        ).withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
            new LiteralText("Click to delete").setStyle(Style.EMPTY.withItalic(true).withColor(Formatting.GRAY))
        )))),
    savingRecordingFile = new LiteralText("[SReplay] Saving")
        .append(new LiteralText("$1").setStyle(Style.EMPTY.withColor(Formatting.GREEN)))
        .append(new LiteralText("video file")),
    savedRecordingFile = new LiteralText("[SReplay] Saved")
        .append(new LiteralText("$1").setStyle(Style.EMPTY.withColor(Formatting.GREEN)))
        .append(new LiteralText("的录像文件"))
        .append(new LiteralText("$2").setStyle(Style.EMPTY.withColor(Formatting.GREEN))),
    failedToSaveRecordingFile = red("[SReplay] Saving a $1 recording file failed：$2"),
    startedRecording = new LiteralText("[SReplay] $1 Recording has started"),
    aboutToDeleteRecording = new LiteralText("[SReplay] The recording file will be deleted for $1"),
    recordingFile = new LiteralText("[SReplay] $1 is recording")
        .append(new LiteralText("$2").setStyle(Style.EMPTY.withColor(Formatting.GOLD))),
    sizeLimitTooSmall = red("[SReplay] The size limit cannot be less than 10M"),
    timeLimitTooSmall = red("[SReplay] The time limit cannot be less than 10s"),
    recordingPaused = new LiteralText("[SReplay] $1: ")
        .append(new LiteralText("$2").setStyle(Style.EMPTY.withColor(Formatting.GOLD)))
        .append(new LiteralText("Recording has been paused")),
    recordingResumed = new LiteralText("[SReplay] $1: ")
        .append(new LiteralText("$2").setStyle(Style.EMPTY.withColor(Formatting.GOLD)))
        .append(new LiteralText("Recording has continued")),
    markerAdded = new LiteralText("[SReplay] $1: Already in")
        .append(new LiteralText("$2").setStyle(Style.EMPTY.withColor(Formatting.GOLD)))
        .append(new LiteralText("Add a tag"))
        .append(new LiteralText("$3").setStyle(Style.EMPTY.withItalic(true).withColor(Formatting.GREEN))),
    markerRemoved = new LiteralText("[SReplay] $1: Already in")
        .append(new LiteralText("$2").setStyle(Style.EMPTY.withColor(Formatting.GOLD)))
        .append(new LiteralText("Remove the tag"))
        .append(new LiteralText("$3").setStyle(Style.EMPTY.withItalic(true).withColor(Formatting.GREEN))),
    invalidMarkerId = red("[SReplay] The invalid marker serial number"),
    markerListTitle = new LiteralText("[SReplay] ")
        .append(new LiteralText("$1").setStyle(Style.EMPTY.withColor(Formatting.GOLD)))
        .append("all tags："),
    markerListItem = new LiteralText("- [$2] $3")
        .append(new LiteralText("[Delete]").setStyle(Style.EMPTY.withColor(Formatting.GREEN)
            .withClickEvent(new ClickEvent(Action.RUN_COMMAND, "/sreplay player $1 marker remove $2"))
        )),
    renamedFile = new LiteralText("[SReplay] $1: Has been")
        .append(new LiteralText("$2").setStyle(Style.EMPTY.withColor(Formatting.GREEN)))
        .append(new LiteralText("The file name is set to"))
        .append(new LiteralText("$3").setStyle(Style.EMPTY.withColor(Formatting.GREEN))),
    serverStarted = new LiteralText("[SReplay] The download server has started"),
    serverStartFailed = red("[SReplay] The download server failed to start：$1"),
    serverStopped = new LiteralText("[SReplay] The download server has stopped"),
    serverStopFailed = new LiteralText("[SReplay] The download server stopped：$1"),
    downloadUrl = new LiteralText("[SReplay] Download the link：")
        .append(new LiteralText("$1").setStyle(Style.EMPTY.withFormatting(Formatting.UNDERLINE)
            .withClickEvent(new ClickEvent(Action.OPEN_URL, "$1"))
            .withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, 
                new LiteralText("Click to download").setStyle(Style.EMPTY.withColor(Formatting.GRAY).withItalic(true))
            )))),
    autoPaused = new LiteralText("[SReplay] $1: No players nearby, pause recording"),
    autoResumed = new LiteralText("[SReplay] $1: There are players nearby, continue recording"),
    setParam = new LiteralText("[SReplay] $1: will")
        .append(new LiteralText("$2").setStyle(Style.EMPTY.withColor(Formatting.GOLD)))
        .append(new LiteralText("target"))
        .append(new LiteralText("$3").setStyle(Style.EMPTY.withColor(Formatting.GREEN)))
        .append(new LiteralText("The value is set to"))
        .append(new LiteralText("$4").setStyle(Style.EMPTY.withColor(Formatting.GREEN))),
    getParam = new LiteralText("[SReplay]").append(
        new LiteralText("$1").setStyle(Style.EMPTY.withColor(Formatting.GREEN))
    ).append(new LiteralText("target")).append(
        new LiteralText("$2").setStyle(Style.EMPTY.withColor(Formatting.GREEN))
    ).append(new LiteralText("The value is")).append(
        new LiteralText("$3").setStyle(Style.EMPTY.withColor(Formatting.GREEN))
    ),
    positiveParam = red("[SReplay] This parameter must be a positive integer"),
    nonNegativeOrMinusOne = red("[SReplay] This parameter must be -1 or non-negative"),
    invalidEnum = red("[SReplay] The value that is not valid"),
    paginationFooter = new LiteralText("第").append(
        green("($1/$2)")
    ).append(white("page")),
    invalidPageNum = red("[SReplay] The invalid page number"),
    noSuchParam = red("[SReplay] There is no such argument"),
    paramHelp = yellow("$1: ").append(green("$2")),
    botLocation = white("[SReplay] ")
        .append(green("$1"))
        .append(white("situated"))
        .append(white("[x: $2, y: $3, z: $4, dim: $5]")),
    saveRecordingProgressBarTitle = white("Save the recording file").append(green("$1")),
    killConfirm = new LiteralText("[SReplay] Make sure you want to stop")
        .append(green("$1"))
        .append(white("the recording of？"));

    public Text[] help = new Text[]{
        new LiteralText("====== SReplay usage ======").setStyle(Style.EMPTY.withColor(Formatting.YELLOW)),
        green("/sreplay player <The player's name> ..."),
        green("- spawn ").append(white("Summon a video dummy and start recording")),
        green("- kill ").append(white("Kick off the designated video dummy and save the recording file")),
        green("- respawn ").append(white("Kick off the dummy, save the file, and start a new round of recording in place")),
        green("- name [filename]").append(white("Get or set the recording file name")),
        green("- tp").append(white("Transfer a video dummy to your location")),
        green("- pause").append(white("Pause the recording")),
        green("- resume").append(white("Continue recording")),
        green("- locate").append(white("Displays the location of the dummy")),
        green("- marker list [The tag name]").append(white("Lists all tags that have been added")),
        green("- marker add [标记名]").append(white("Add a tag at the current location")),
        green("- marker remove [Mark the serial number]").append(white("Delete a tag")),
        green("- set <The name of the option> [The value of the argument]").append(white("Set or get the value of the appropriate recording option, please use for details")).append(green("/sreplay help set <The name of the option>")),
        white(""),
        green("/sreplay list [页码]").append(white("Lists all recorded files")),
        green("/sreplay delete <文件名>").append(white("Delete the given recording file. Need to use")).append(green("/sreplay confirm <Confirmation code>")).append(white("to confirm")),
        green("/sreplay reload").append(white("Reload the profile")),
        green("/sreplay server <start|stop>").append(white("Start/stop the http server used to download the recording file")),
        green("/sreplay get <filename>").append(white("Download the specified recording file. The command returns a temporary link to download the file."))
    };
}